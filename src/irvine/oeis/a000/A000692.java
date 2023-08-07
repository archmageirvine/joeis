package irvine.oeis.a000;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Objects;
import java.util.zip.GZIPInputStream;

import org.apfloat.Apfloat;
import org.apfloat.ApfloatMath;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.io.IOUtils;

/**
 * A000692 An approximation to population of x^2 + y^2 &lt;= 2^n.
 * @author Sean A. Irvine
 */
public class A000692 extends Sequence0 {

  // This cheats quite a lot by using a large precomputed value for the
  // second-order Landau-Ramanujan constant.  This value was computed by
  // David E. G. Hare, 1996.
  // See http://pi.lacim.uqam.ca/piDATA/landau.txt
  private static final String C1;
  static {
    try {
      try (final GZIPInputStream is = new GZIPInputStream(Objects.requireNonNull(A000690.class.getClassLoader().getResourceAsStream("irvine/oeis/a000/landau2.gz")))) {
        C1 = IOUtils.readAll(is);
      }
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  private int mN = -1;
  private int mDigits = 20;
  private Apfloat mB = null;
  private Apfloat mC = null;
  private Apfloat mBMin = null;
  private Apfloat mBMax = null;
  private Apfloat mHalf = null;


  private void resetConstants(final int digits) {
    if (digits < 3 || digits > A000690.C0.length()) {
      throw new UnsupportedOperationException();
    }
    final String c0 = A000690.C0.substring(0, digits);
    // Be conservative, only use half the digits for comparsion
    final Z z = new Z(c0.substring(2, digits / 2));
    final String cMin = "0." + z.subtract(1);
    final String cMax = "0." + z.add(1);
    mB = new Apfloat(c0);
    mBMin = new Apfloat(cMin, mB.precision());
    mBMax = new Apfloat(cMax, mB.precision());
    mHalf = new Apfloat("0.5", mB.precision());
    mC = new Apfloat(C1, mB.precision());
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      resetConstants(mDigits);
      return Z.ONE;
    }
    while (true) {
      final Apfloat x = new Apfloat(BigInteger.ONE.shiftLeft(mN), mB.precision());
      final Apfloat logx = ApfloatMath.log(x);
      final Apfloat u = mC.divide(logx).add(new Apfloat(1));
      final Apfloat m = x.divide(ApfloatMath.sqrt(logx)).multiply(u);

      // Compute at three points, if any value differs, then double the digits in the constant and recompute.
      final BigInteger v = mB.multiply(m).add(mHalf).truncate().toBigInteger();
      final BigInteger vMin = mBMin.multiply(m).add(mHalf).truncate().toBigInteger();
      final BigInteger vMax = mBMax.multiply(m).add(mHalf).truncate().toBigInteger();
      if (v.equals(vMin) && v.equals(vMax)) {
        return Z.valueOf(v);
      }
      // Need to increase precision
      mDigits *= 2;
      resetConstants(mDigits);
    }
  }
}



