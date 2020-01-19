package irvine.oeis.a004;

/**
 * A004706 Expansion of e.g.f. <code>1/(9 - Sum_{k=1..8} exp(k*x))</code>.
 * @author Sean A. Irvine
 */
public class A004706 extends A004701 {

  @Override
  protected int terms() {
    return 9;
  }
}

