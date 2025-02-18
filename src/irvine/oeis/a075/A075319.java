package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075319 Pair the odd numbers such that the k-th pair is (r, r+2k) where r is the smallest odd number not included earlier: (1,3),(5,9),(7,13),(11,19),(15,25),(17,29),(21,35),(23,39),(27,45),... This is the sequence of the sum of the members of pairs.
 * @author Sean A. Irvine
 */
public class A075319 extends A075317 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return super.next().multiply2().add(mN);
  }
}
