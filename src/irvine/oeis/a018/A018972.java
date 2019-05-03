package irvine.oeis.a018;

/**
 * A018972 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite AFY <code>= CoAPO-50 R3 [ Co3Al5P8O32 ] .7 H2O</code>.
 * @author Sean A. Irvine
 */
public class A018972 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // AFY
    return "a-1: a-15(0+0) b-14(000) a-7(000) a-5(000)\n"
      + "a-5: a-11(-00) b-10(000)\n"
      + "a-7: b-10(000) a-9(0+0)\n"
      + "b-2: a-16(000) a-15(000) a-13(000) b-6(00-)\n"
      + "b-6: a-12(000) a-11(000) a-9(000)\n"
      + "a-3: b-14(000) a-13(-00) a-8(000) a-5(000)\n"
      + "a-8: a-12(000) b-10(000)\n"
      + "a-4: a-16(000) b-14(000) a-8(000) a-7(000)\n"
      + "b-10: b-14(00+)\n"
      + "a-11: a-16(000) a-13(000)\n"
      + "a-9: a-15(000) a-13(000)\n"
      + "a-12: a-16(000) a-15(000)\n";
  }

  @Override
  protected String startNode() {
    return "b-2";
  }
}

