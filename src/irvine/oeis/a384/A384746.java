package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384746 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384746() {
    super(19073486328125L, 0, 1L << 48);
  }
}
