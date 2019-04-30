package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019139 Cycle class sequence <code>c(n)</code> (the number of true cycles of length n in which a certain node is included) for zeolite LOV = Lovdarite K4Na12 [ Be8Si28O72 <code>] . 18</code> H2O.
 * @author Sean A. Irvine
 */
public class A019139 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // LOV
    return "a-1: a-11(00-) b-8(000) a-7(000) b-2(000)\n"
      + "b-2: b-8(0+0) a-7(-00) c-6(0+0)\n"
      + "a-7: a-13(00-) b-8(+00)\n"
      + "a-11: b-14(000) a-13(000) b-12(000)\n"
      + "c-6: b-18(000) b-16(-00) b-8(000)\n"
      + "c-3: b-14(0-0) b-12(000) b-10(-00) b-5(000)\n"
      + "b-5: b-10(-00) a-9(0-0)\n"
      + "b-12: b-14(0-0) a-13(-00)\n"
      + "a-4: a-15(000) b-10(000) a-9(000) b-5(000)\n"
      + "a-9: a-17(000) b-10(0+0)\n"
      + "a-15: b-18(000) a-17(000) b-16(000)\n"
      + "b-16: b-18(+00) a-17(0-0)\n"
      + "a-13: b-14(+00)\n"
      + "a-17: b-18(0+0)\n";
  }
}

