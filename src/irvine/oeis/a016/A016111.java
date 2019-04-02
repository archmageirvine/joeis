package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016111 Expansion of 1/((1-11x)(1-12x)(1-13x)(1-14x)(1-15x)).
 * @author Sean A. Irvine
 */
public class A016111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016111() {
    super(new long[] {360360, -140274, 21775, -1685, 65}, new long[] {1, 65, 2540, 77350, 2022951});
  }
}
