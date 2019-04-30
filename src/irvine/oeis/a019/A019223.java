package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019223 Cycle class sequence <code>c(n)</code> (the number of true cycles of length n in which a certain node is included) for zeolite RTE = RUB-3 [ Si24O48 <code>] . 2</code> R.
 * @author Sean A. Irvine
 */
public class A019223 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // RTE
    return "a-1: c-9(+00) a-4(00+) c-3(00+) b-2(000)\n"
      + "b-2: b-11(000) b-5(000) c-3(000)\n"
      + "c-3: c-12(000) a-7(+00)\n"
      + "a-4: c-12(0-0) c-6(00-) b-5(000)\n"
      + "b-5: b-8(000) c-6(000)\n"
      + "b-11: c-12(000)\n"
      + "a-7: a-10(00-) c-9(00-) b-8(000)\n"
      + "c-6: a-10(0-0) c-9(000)\n"
      + "b-8: b-11(000) c-9(000)\n"
      + "a-10: c-12(00+) b-11(000)\n";
  }
}

