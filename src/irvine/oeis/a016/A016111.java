package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016111 Expansion of g.f. 1/((1-11*x)*(1-12*x)*(1-13*x)*(1-14*x)*(1-15*x)).
 * @author Sean A. Irvine
 */
public class A016111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016111() {
    super(new long[] {360360, -140274, 21775, -1685, 65}, new long[] {1, 65, 2540, 77350, 2022951});
  }
}
