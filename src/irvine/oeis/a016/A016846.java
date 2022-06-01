package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016846 a(n) = (4*n + 3)^10.
 * @author Sean A. Irvine
 */
public class A016846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016846() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {59049, 282475249, 25937424601L, 576650390625L, 6131066257801L, 41426511213649L, 205891132094649L, 819628286980801L, 2758547353515625L, 8140406085191601L, 21611482313284249L});
  }
}
