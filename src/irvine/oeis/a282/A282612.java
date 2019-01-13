package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282612.
 * @author Sean A. Irvine
 */
public class A282612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282612() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 120, 3654, 45760, 333375, 1703016, 6784540, 22500864, 64836045});
  }
}
