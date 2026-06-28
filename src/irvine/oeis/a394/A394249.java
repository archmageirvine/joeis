package irvine.oeis.a394;

import irvine.oeis.a002.A002473;
import irvine.oeis.a397.A397452;

/**
 * A394249 Number of partitions of n into two 7-smooth numbers.
 * @author Sean A. Irvine
 */
public class A394249 extends A397452 {

  /** Construct the sequence. */
  public A394249() {
    super(new A002473());
  }
}
