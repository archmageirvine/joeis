package irvine.oeis.a004;

/**
 * A004706 Expansion of <code>1/(9 - Sum_{k=1..8}</code> exp(k*x)).
 * @author Sean A. Irvine
 */
public class A004706 extends A004701 {

  @Override
  protected int terms() {
    return 9;
  }
}

