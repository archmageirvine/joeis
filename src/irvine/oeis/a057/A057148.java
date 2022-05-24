package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a006.A006995;

/**
 * A057148 Palindromes only using 0 and 1 (i.e., base-2 palindromes).
 * @author Sean A. Irvine
 */
public class A057148 extends A006995 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}
