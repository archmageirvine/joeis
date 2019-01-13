package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036092.
 * @author Sean A. Irvine
 */
public class A036092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036092() {
    super(new long[] {1, -15, 105, -455, 1365, -3003, 5005, -6435, 6435, -5005, 3003, -1365, 455, -105, 15}, new long[] {1, 16385, 4799353, 273218425, 6371951081L, 84467679721L, 756587236945L, 5076269583953L, 27274838966065L, 122876792454961L, 479749833583241L, 1663668298132105L, 5221294850248153L, 15049383211257305L, 40304932850948641L});
  }
}
