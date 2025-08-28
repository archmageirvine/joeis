package irvine.oeis.a384;

import irvine.oeis.a000.A000041;
import irvine.oeis.a386.A386993;

/**
 * A384931 Number of 2-dense sublists of divisors of the number of partitions of n.
 * @author Sean A. Irvine
 */
public class A384931 extends A386993 {

  /** Construct the sequence. */
  public A384931() {
    super(0, new A000041());
  }
}

