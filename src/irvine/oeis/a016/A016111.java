package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016111.
 * @author Sean A. Irvine
 */
public class A016111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016111() {
    super(new long[] {360360, -140274, 21775, -1685, 65}, new long[] {1, 65, 2540, 77350, 2022951});
  }
}
