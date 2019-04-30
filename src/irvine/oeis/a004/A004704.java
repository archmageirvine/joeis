package irvine.oeis.a004;

/**
 * A004704 Expansion of <code>1/(7- Sum_{k=1..6} exp(k*x))</code>.
 * @author Sean A. Irvine
 */
public class A004704 extends A004701 {

  @Override
  protected int terms() {
    return 7;
  }
}

