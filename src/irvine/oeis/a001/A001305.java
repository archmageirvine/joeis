package irvine.oeis.a001;

/**
 * A001305 Expansion of 1/((1-x)^2*(1-x^2)*(1-x^5)*(1-x^10)*(1-x^20)).
 * @author Sean A. Irvine
 */
public class A001305 extends A001312 {

  /** Construct the sequence. */
  public A001305() {
    super(1, 1, 2, 5, 10, 20);
  }
}
