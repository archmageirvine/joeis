package irvine.oeis.a019;

import java.io.BufferedReader;
import java.io.IOException;

import irvine.oeis.a018.A018940;
import irvine.util.io.IOUtils;

/**
 * A019067 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite BEA = Beta Na7[Al7Si57O128] starting with a T1 atom.
 * @author Sean A. Irvine
 */
public class A019067 extends A018940 {

  /** Construct the sequence. */
  public A019067() {
    super(3, 1);
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // BEA
    try (final BufferedReader reader = IOUtils.reader("irvine/oeis/a019/a019067.dat.gz")) {
      return IOUtils.readAll(reader);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }
}

