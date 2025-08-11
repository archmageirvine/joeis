package irvine.oeis.a079;

/**
 * A079351 a(1)=3; for n &gt; 1, a(n) is the smallest integer greater than a(n-1) consistent with the condition "n is in the sequence if and only if a(n) is congruent to 0 (mod 5)".
 * @author Sean A. Irvine
 */
public class A079351 extends A079000 {

  /** Construct the sequence. */
  public A079351() {
    super(1, 3, 4, k -> k.mod(5) == 0);
  }
}
