package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219088 <code>Floor((n + 1/2)^5)</code>.
 * @author Sean A. Irvine
 */
public class A219088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219088() {
    super(new long[] {-1, 5, -10, 10, -5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -5, 10, -10, 5}, new long[] {0, 7, 97, 525, 1845, 5032, 11602, 23730, 44370, 77378, 127628, 201135, 305175, 448403, 640973, 894660, 1222981, 1641308, 2166998, 2819506, 3620506});
  }
}
