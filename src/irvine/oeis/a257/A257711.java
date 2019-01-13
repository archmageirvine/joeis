package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257711.
 * @author Sean A. Irvine
 */
public class A257711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257711() {
    super(new long[] {1, -1, -254, 254, 1}, new long[] {210, 3486, 51681, 883785, 13125126});
  }
}
