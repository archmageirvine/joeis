package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086029 <code>a(n) = Sum_{i=1..n} C(i+6,7)^2</code>.
 * @author Sean A. Irvine
 */
public class A086029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086029() {
    super(new long[] {-1, 16, -120, 560, -1820, 4368, -8008, 11440, -12870, 11440, -8008, 4368, -1820, 560, -120, 16}, new long[] {1, 65, 1361, 15761, 124661, 751925, 3696581, 15475205, 56884430, 187758030, 565982734, 1578749710, 4117700254L, 10127050654L, 23648089054L, 52733344990L});
  }
}
