package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199559 2*9^n+1.
 * @author Sean A. Irvine
 */
public class A199559 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199559() {
    super(new long[] {-9, 10}, new long[] {3, 19});
  }
}
