package irvine.oeis.a072;

import irvine.oeis.FiniteSequence;

/**
 * A072717 Let d(k) be the sequence whose values are in (1,2,3,4,5,6,7,8,9) and are such that the continued fraction for the decimal number D(n)=0.d(1)d(2)...d(n) has strictly more elements than the continued fraction for D(n-1)=0.d(1)d(2)...d(n-1) and d(n) is as small as possible. Sequence gives values of d(n)=a(n) for d(1)=1.
 * @author Georg Fischer
 */
public class A072717 extends FiniteSequence {

  /** Construct the sequence. */
  public A072717() {
    super(1, 2, 3, 4, 7, 3, 1, 7, 7, 1, 1, 3, 7, 1, 2, 2, 7);
  }
}
