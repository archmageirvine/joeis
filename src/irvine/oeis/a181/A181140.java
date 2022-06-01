package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181140 The number of ways to color n balls in a row with 3 colors with no color runs having lengths greater than 4. This sequence is a special case of the general problem for coloring n balls in a row with p colors where each color has a given maximum run-length. In this example, the bounds are uniformly 4. It can be phrased in terms of tossing a p-faced dice n times, requiring each face having no runs longer than b.
 * @author Sean A. Irvine
 */
public class A181140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181140() {
    super(new long[] {2, 2, 2, 2}, new long[] {3, 9, 27, 81});
  }
}
