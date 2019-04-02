package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145923 Second bisection of A061041: A061041(2n+1). a(n)=(2n+1)*(2n+9)=A005408(n)*A005408(n+4). a(n)=a(n-1)+8*(n+2)=a(n-1)+8n+16.
 * @author Sean A. Irvine
 */
public class A145923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145923() {
    super(new long[] {1, -3, 3}, new long[] {9, 33, 65});
  }
}
