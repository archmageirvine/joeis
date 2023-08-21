package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065199 Record high values in A033665, ignoring those numbers that are believed never to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A065199 extends A065198 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mBest);
  }
}
