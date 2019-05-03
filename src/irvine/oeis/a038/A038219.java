package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a007.A007061;

/**
 * A038219 The Ehrenfeucht-Mycielski sequence <code>(0,1-version)</code>: a maximally unpredictable sequence.
 * @author Sean A. Irvine
 */
public class A038219 extends A007061 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
