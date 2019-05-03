package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152448 <code>a(0)=a(1)=1, a(2)=6, a(3)=11; a(n+4)=10*a(n+2)-a(n)</code>.
 * @author Sean A. Irvine
 */
public class A152448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152448() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 1, 6, 11});
  }
}
