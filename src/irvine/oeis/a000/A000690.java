package irvine.oeis.a000;

import java.io.IOException;
import java.math.BigInteger;
import java.util.zip.GZIPInputStream;

import org.apfloat.Apfloat;
import org.apfloat.ApfloatMath;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.io.IOUtils;

/**
 * A000690.
 * @author Sean A. Irvine
 */
public class A000690 implements Sequence {

  // This cheats quite a lot by using a large precomputed value for the
  // Landau-Ramanujan constant.  This value was computed by
  // David E. G. Hare, September, 2010.
  // See https://oeis.org/A064533/a064533_1.txt
  static final String C0;
  static {
    try {
      try (final GZIPInputStream is = new GZIPInputStream(A000690.class.getClassLoader().getResourceAsStream("irvine/oeis/a000/landau.gz"))) {
        C0 = IOUtils.readAll(is);
      }
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  private int mN = -1;
  private int mDigits = 20;
  private Apfloat mB = null;
  private Apfloat mBMin = null;
  private Apfloat mBMax = null;
  private Apfloat mHalf = null;


  private void resetConstants(final int digits) {
    if (digits < 3 || digits > C0.length()) {
      throw new UnsupportedOperationException();
    }
    final String c0 = C0.substring(0, digits);
    // Be conservative, only use half the digits for comparison
    final Z z = new Z(c0.substring(2, digits / 2));
    final String cMin = "0." + z.subtract(1);
    final String cMax = "0." + z.add(1);
    mB = new Apfloat(c0);
    mBMin = new Apfloat(cMin, mB.precision());
    mBMax = new Apfloat(cMax, mB.precision());
    mHalf = new Apfloat("0.5", mB.precision());
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      resetConstants(mDigits);
      return Z.ONE;
    }
    while (true) {
      final Apfloat x = new Apfloat(BigInteger.ONE.shiftLeft(mN), mB.precision());
      final Apfloat m = x.divide(ApfloatMath.sqrt(ApfloatMath.log(x)));

      // Compute at three points, if any value differs, then double the
      // digits in the constant and recompute.

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


