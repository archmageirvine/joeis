package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035123 Roots of 'non-palindromic squares remaining square when written backwards'.
 * @author Sean A. Irvine
 */
public class A035123 extends A035090 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
