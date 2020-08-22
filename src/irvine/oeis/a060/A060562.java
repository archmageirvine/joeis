package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060562 Number of ways to color vertices of a 10-gon using &lt;= n colors, allowing rotations and reflections.
 * @author Sean A. Irvine
 */
public class A060562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060562() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 1, 78, 3210, 53764, 493131, 3037314, 14158228, 53762472, 174489813, 500280022});
  }
}
