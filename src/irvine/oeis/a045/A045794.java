package irvine.oeis.a045;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A045794 Consider all quadruples {a,b,c,d} which reach {k,k,k,k} in n steps under map {a,b,c,d}-&gt;{|a-b|,|b-c|,|c-d|,|d-a|}; look at max{a,b,c,d}; sequence gives minimal value of this.
 * @author Sean A. Irvine
 */
public class A045794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045794() {
    super(1, new long[] {1, 0, 0, 1, 0, 0, 3, 0, 0}, new long[] {1, 1, 1, 3, 3, 4, 9, 11, 13});
  }
}
