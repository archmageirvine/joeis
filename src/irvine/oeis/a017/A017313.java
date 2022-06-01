package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017313 a(n) = (10*n + 3)^9.
 * @author Sean A. Irvine
 */
public class A017313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017313() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {19683, 10604499373L, 1801152661463L, 46411484401953L, 502592611936843L, 3299763591802133L, 15633814156853823L, 58871586708267913L, 186940255267540403L, 520411082988487293L});
  }
}
