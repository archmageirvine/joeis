package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075912 Fourth column of triangle A075500.
 * @author Sean A. Irvine
 */
public class A075912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075912() {
    super(new long[] {-15000, 6250, -875, 50}, new long[] {1, 50, 1625, 43750});
  }
}
