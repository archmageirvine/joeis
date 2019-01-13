package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A002307.
 * @author Sean A. Irvine
 */
public class A002307 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  protected int residueType() {
    return 1;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long longest = 0;
    long current = 0;
    for (Z q = Z.ONE; q.compareTo(mP) < 0; q = q.add(1)) {
      if (q.jacobi(mP) == residueType()) {
        ++current;
      } else {
        if (current > longest) {
          longest = current;
        }
        current = 0;
      }
    }
    if (current > longest) {
      longest = current;
    }
    return Z.valueOf(longest);
  }
}
