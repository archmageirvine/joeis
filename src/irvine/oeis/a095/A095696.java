package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095696 <code>T(n,5)</code> diagonal of triangle in <code>A095693</code>.
 * @author Sean A. Irvine
 */
public class A095696 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095696() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {22, 822, 8547, 52892, 238392, 863289, 2660889, 7245414, 17879004, 40719679, 86762676});
  }
}
