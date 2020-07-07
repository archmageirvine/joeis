package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a006.A006878;

/**
 * A033492 Record number of steps to reach 1 in <code>'3x+1'</code> problem, corresponding to starting values in <code>A006877</code> (same as <code>A006878</code> except here we start counting at 1 instead of <code>0)</code>.
 * @author Sean A. Irvine
 */
public class A033492 extends A006878 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
