package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A083104.
 * @author Sean A. Irvine
 */
public class A083104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083104() {
    super(new long[] {1, 1}, new Z[] {new Z("331635635998274737472200656430763"), new Z("1510028911088401971189590305498785")});
  }
}
