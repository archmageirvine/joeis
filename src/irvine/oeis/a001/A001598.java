package irvine.oeis.a001;

import irvine.math.z.Z;

import java.util.ArrayList;

/**
 * A001598 Number of terms in {b(1)..b(n)} relatively prime to b(n), where b(n) = A001597(n).
 * @author Sean A. Irvine
 */
public class A001598 extends A001597 {

  private final ArrayList<Z> mSeq = new ArrayList<>();

  @Override
  public Z next() {
    final Z t = super.next();
    mSeq.add(t);
    long c = 0;
    for (final Z v : mSeq) {
      if (t.gcd(v).equals(Z.ONE)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
