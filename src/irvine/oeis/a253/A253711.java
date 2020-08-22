package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253711 Second partial sums of 11th powers (A008455).
 * @author Sean A. Irvine
 */
public class A253711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253711() {
    super(new long[] {-1, 14, -91, 364, -1001, 2002, -3003, 3432, -3003, 2002, -1001, 364, -91, 14}, new long[] {1, 2050, 181246, 4554746, 57756371, 473755052, 2867080476L, 13850340492L, 56214660117L, 198578979742L, 626254969978L, 1796939330902L, 4759784085863L, 11772194010488L});
  }
}
