package irvine.oeis.a178;

import irvine.oeis.a004.A004601;
import irvine.oeis.a084.A084185;

/**
 * A178707 Position of the start of the first occurrence of n (expressed in binary) after the binary point in the binary expansion of Pi.
 * @author Sean A. Irvine
 */
public class A178707 extends A084185 {

  /** Construct the sequence. */
  public A178707() {
    super(0, new A004601().skip(2));
  }
}

