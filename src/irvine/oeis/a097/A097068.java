package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097068 a(n)=Sum(C(n,2k+1)5^k 3^(2k+1) 7^(n-2k-1), k=0,..,Floor[(n-1)/2]).
 * @author Sean A. Irvine
 */
public class A097068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097068() {
    super(new long[] {-4, 14}, new long[] {0, 3});
  }
}
