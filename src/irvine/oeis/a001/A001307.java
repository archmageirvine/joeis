package irvine.oeis.a001;

/**
 * A001307 Expansion of 1/(1-x)^2/(1-x^2)/(1-x^4)/(1-x^10)/(1-x^20).
 * @author Sean A. Irvine
 */
public class A001307 extends A001312 {

  /** Construct the sequence. */
  public A001307() {
    super(1, 1, 2, 4, 10, 20);
  }
}
