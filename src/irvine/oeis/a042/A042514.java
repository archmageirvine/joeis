package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042514.
 * @author Sean A. Irvine
 */
public class A042514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042514() {
    super(new long[] {-1, 0, 1570, 0}, new long[] {28, 785, 43988, 1232449});
  }
}
