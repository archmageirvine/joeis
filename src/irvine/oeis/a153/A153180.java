package irvine.oeis.a153;
// manually

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A153180 a(n) = L(13n)/L(n) where L(n) = Lucas number A000204(n).
 * @author Georg Fischer
 */
public class A153180 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A153180() {
    super(1, "[0,-521, 30912, 3207084,-30117780,-397207920, 551134032, 1039739226,-211072608,-57490620, 1714020, 64464,-288,-1]",
        "[-1, 233, 33552,-1493064,-27372840, 186135312, 488605194,-488605194,-186135312, 27372840, 1493064,-33552,-233, 1]");
  }
}
