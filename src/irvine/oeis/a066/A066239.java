package irvine.oeis.a066;

/**
 * A066239 The floor(1.001*x)-perfect numbers, where f-perfect numbers for an arithmetical function f are defined in A066218.
 * @author Sean A. Irvine
 */
public class A066239 extends A066367 {

  /** Construct the sequence. */
  public A066239() {
    super(k -> k * 1001L / 1000);
  }
}
