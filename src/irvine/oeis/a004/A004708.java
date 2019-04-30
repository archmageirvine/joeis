package irvine.oeis.a004;

/**
 * A004708 Expansion of <code>1/(11 - Sum_{k=1..10} exp(k*x))</code>.
 * @author Sean A. Irvine
 */
public class A004708 extends A004701 {

  @Override
  protected int terms() {
    return 11;
  }
}

