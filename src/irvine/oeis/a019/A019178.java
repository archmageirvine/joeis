package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019178 Cycle class sequence <code>c(n)</code> (the number of true cycles of length n in which a certain node is included) for zeolite MON = Montesommaite <code>(K,Na)9[ Al9Si23O64 ] . 10 H2O</code>.
 * @author Sean A. Irvine
 */
public class A019178 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // MON
    return "a-1: a-8(00+) a-7(0-0) a-5(0-0) a-3(000)\n"
      + "a-3: a-8(-00) a-7(---) a-6(---)\n"
      + "a-5: a-6(000)\n"
      + "a-7: a-8(000)\n"
      + "a-2: a-7(--0) a-6(---) a-5(0-0) a-4(000)\n"
      + "a-4: a-8(-0+) a-6(-00) a-5(00+)\n";
  }
}

