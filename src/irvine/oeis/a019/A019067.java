package irvine.oeis.a019;

import java.io.BufferedReader;
import java.io.IOException;

import irvine.oeis.a018.A018940;
import irvine.util.io.IOUtils;

/**
 * A019067.
 * @author Sean A. Irvine
 */
public class A019067 extends A018940 {

  @Override
  protected int step() {
    return 1;
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

