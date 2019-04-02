package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042724 Numerators of continued fraction convergents to sqrt(892).
 * @author Sean A. Irvine
 */
public class A042724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042724() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 200702, 0, 0, 0, 0, 0, 0, 0}, new long[] {29, 30, 209, 448, 6481, 13410, 86941, 100351, 5907299, 6007650, 41953199, 89914048, 1300749871, 2691413790L, 17449232611L, 20140646401L});
  }
}
