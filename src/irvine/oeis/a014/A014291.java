package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014291 Imaginary Rabbits: imaginary part of a(0)=i; a(1)=-i; a(n) = a(n-1) + i*a(n-2), with i = sqrt(-1).
 * @author Sean A. Irvine
 */
public class A014291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014291() {
    super(new long[] {-1, 0, -1, 2}, new long[] {1, -1, -1, -1});
  }
}

