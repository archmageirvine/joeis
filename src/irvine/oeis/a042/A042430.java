package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042430 Numerators of continued fraction convergents to <code>sqrt(743)</code>.
 * @author Sean A. Irvine
 */
public class A042430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042430() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 1428048, 0, 0, 0, 0, 0, 0, 0}, new long[] {27, 82, 109, 845, 22924, 161313, 184237, 714024, 38741533, 116938623, 155680156, 1206699715, 32736572461L, 230362706942L, 263099279403L, 1019660545151L});
  }
}
