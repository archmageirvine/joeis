package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132418 Sequence is identical to its third differences in absolute values: a(n+k)=3a(n+k-1)-3a(n+k-2)+2a(n+k-3), k=0, 1, 2, 3, 4, a(n+5)=3a(n+4)-3a(n+3), n &gt; 2.
 * @author Sean A. Irvine
 */
public class A132418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132418() {
    super(new long[] {43, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 5, 10, 21});
  }
}
